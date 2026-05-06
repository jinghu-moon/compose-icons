package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ProjectorScreen: ImageVector
    get() {
        if (_projectorScreen != null) return _projectorScreen!!
        _projectorScreen = phosphorBoldIcon(
            name = "ProjectorScreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 72v-24C236 36.954 227.046 28 216 28h-176C28.954 28 20 36.954 20 48v24c-.002 9.505 6.687 17.699 16 19.6v72.4h-4c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h84v23.22c-9.407 5.431-13.994 16.504-11.182 26.996 2.811 10.492 12.32 17.788 23.182 17.788 10.863 0 20.371-7.296 23.182-17.788C153.994 227.724 149.407 216.651 140 211.22v-23.22h84c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-4v-72.4C229.313 89.699 236.002 81.505 236 72ZM44 52h168v16h-168ZM60 164v-72h136v72Z"),
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
        return _projectorScreen!!
    }

private var _projectorScreen: ImageVector? = null
