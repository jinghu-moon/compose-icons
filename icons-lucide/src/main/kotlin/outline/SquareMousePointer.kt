package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquareMousePointer: ImageVector
    get() {
        if (_squareMousePointer != null) return _squareMousePointer!!
        _squareMousePointer = lucideOutlineIcon(
            name = "SquareMousePointer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.034 12.681 C 11.960 12.496 12.004 12.285 12.144 12.144 C 12.285 12.004 12.496 11.960 12.681 12.034 L 21.681 15.534 C 21.879 15.611 22.006 15.805 21.999 16.017 C 21.991 16.229 21.851 16.414 21.648 16.477 L 18.204 17.545 C 17.889 17.643 17.642 17.890 17.544 18.205 L 16.477 21.648 C 16.414 21.851 16.229 21.991 16.017 21.999 C 15.805 22.006 15.611 21.879 15.534 21.681 Z"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 21.000 11.000 L 21.000 5.000 C 21.000 3.895 20.105 3.000 19.000 3.000 L 5.000 3.000 C 3.895 3.000 3.000 3.895 3.000 5.000 L 3.000 19.000 C 3.000 20.105 3.895 21.000 5.000 21.000 L 11.000 21.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _squareMousePointer!!
    }

private var _squareMousePointer: ImageVector? = null
