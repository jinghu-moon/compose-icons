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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 78.000 36.000 C 54.804 36.000 36.000 54.804 36.000 78.000 C 36.000 101.196 54.804 120.000 78.000 120.000 C 101.196 120.000 120.000 101.196 120.000 78.000 C 120.000 54.804 101.196 36.000 78.000 36.000 ZM 78.000 96.000 C 68.059 96.000 60.000 87.941 60.000 78.000 C 60.000 68.059 68.059 60.000 78.000 60.000 C 87.941 60.000 96.000 68.059 96.000 78.000 C 96.000 87.941 87.941 96.000 78.000 96.000 ZM 178.000 120.000 C 201.196 120.000 220.000 101.196 220.000 78.000 C 220.000 54.804 201.196 36.000 178.000 36.000 C 154.804 36.000 136.000 54.804 136.000 78.000 C 136.000 101.196 154.804 120.000 178.000 120.000 ZM 178.000 60.000 C 187.941 60.000 196.000 68.059 196.000 78.000 C 196.000 87.941 187.941 96.000 178.000 96.000 C 168.059 96.000 160.000 87.941 160.000 78.000 C 160.000 68.059 168.059 60.000 178.000 60.000 ZM 78.000 136.000 C 54.804 136.000 36.000 154.804 36.000 178.000 C 36.000 201.196 54.804 220.000 78.000 220.000 C 101.196 220.000 120.000 201.196 120.000 178.000 C 120.000 154.804 101.196 136.000 78.000 136.000 ZM 78.000 196.000 C 68.059 196.000 60.000 187.941 60.000 178.000 C 60.000 168.059 68.059 160.000 78.000 160.000 C 87.941 160.000 96.000 168.059 96.000 178.000 C 96.000 187.941 87.941 196.000 78.000 196.000 ZM 220.000 178.000 C 220.000 184.627 214.627 190.000 208.000 190.000 L 190.000 190.000 L 190.000 208.000 C 190.000 214.627 184.627 220.000 178.000 220.000 C 171.373 220.000 166.000 214.627 166.000 208.000 L 166.000 190.000 L 148.000 190.000 C 141.373 190.000 136.000 184.627 136.000 178.000 C 136.000 171.373 141.373 166.000 148.000 166.000 L 166.000 166.000 L 166.000 148.000 C 166.000 141.373 171.373 136.000 178.000 136.000 C 184.627 136.000 190.000 141.373 190.000 148.000 L 190.000 166.000 L 208.000 166.000 C 214.627 166.000 220.000 171.373 220.000 178.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _circlesThreePlus!!
    }

private var _circlesThreePlus: ImageVector? = null
