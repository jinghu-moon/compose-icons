package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Origami: ImageVector
    get() {
        if (_origami != null) return _origami!!
        _origami = lucideOutlineIcon(
            name = "Origami",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 12.000 L 12.000 4.000 C 12.000 3.448 12.448 3.000 13.000 3.000 L 19.297 3.000 C 19.715 3.000 20.090 3.261 20.235 3.653 C 20.380 4.045 20.266 4.487 19.948 4.759 L 15.252 8.784"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 12.000 21.000 L 4.586 13.586 C 4.211 13.211 4.000 12.702 4.000 12.172 L 4.000 6.415 C 4.002 6.012 4.246 5.649 4.619 5.494 C 4.991 5.340 5.420 5.424 5.707 5.708 L 20.000 20.009"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 12.214 3.381 L 20.628 18.347 C 20.848 18.739 20.780 19.229 20.461 19.546 L 19.293 20.709 C 19.105 20.896 18.852 21.000 18.587 21.000 L 6.351 21.000 C 6.124 21.000 5.903 20.923 5.726 20.781 L 3.250 18.800 C 2.917 18.534 2.790 18.086 2.932 17.685 C 3.074 17.284 3.455 17.016 3.881 17.019 L 8.046 17.046"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _origami!!
    }

private var _origami: ImageVector? = null
