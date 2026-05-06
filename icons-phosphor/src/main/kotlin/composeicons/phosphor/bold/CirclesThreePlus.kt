package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CirclesThreePlus: ImageVector
    get() {
        if (_circlesThreePlus != null) return _circlesThreePlus!!
        _circlesThreePlus = phosphorBoldIcon(
            name = "CirclesThreePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M78 36C54.804 36 36 54.804 36 78c0 23.196 18.804 42 42 42 23.196 0 42-18.804 42-42C120 54.804 101.196 36 78 36ZM78 96C68.059 96 60 87.941 60 78 60 68.059 68.059 60 78 60c9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18ZM178 120c23.196 0 42-18.804 42-42C220 54.804 201.196 36 178 36c-23.196 0-42 18.804-42 42 0 23.196 18.804 42 42 42ZM178 60c9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18ZM78 136c-23.196 0-42 18.804-42 42 0 23.196 18.804 42 42 42 23.196 0 42-18.804 42-42 0-23.196-18.804-42-42-42ZM78 196c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18ZM220 178c0 6.627-5.373 12-12 12h-18v18c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-18h-18c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h18v-18c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v18h18c6.627 0 12 5.373 12 12Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _circlesThreePlus!!
    }

private var _circlesThreePlus: ImageVector? = null
