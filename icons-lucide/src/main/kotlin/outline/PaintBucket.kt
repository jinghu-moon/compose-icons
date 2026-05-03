package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PaintBucket: ImageVector
    get() {
        if (_paintBucket != null) return _paintBucket!!
        _paintBucket = lucideOutlineIcon(
            name = "PaintBucket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.000 7.000 L 6.000 2.000"),
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
                pathData = parseSvgPathData("M 18.992 12.000 L 2.041 12.000"),
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
                pathData = parseSvgPathData("M 21.145 18.380 C 20.562 17.901 20.158 17.238 20.000 16.500 C 19.845 17.239 19.441 17.903 18.855 18.380 C 18.280 18.840 18.000 19.400 18.000 19.975 C 17.993 20.510 18.201 21.025 18.577 21.405 C 18.953 21.786 19.465 22.000 20.000 22.000 C 20.535 22.000 21.047 21.786 21.423 21.405 C 21.799 21.025 22.007 20.510 22.000 19.975 C 22.000 19.395 21.715 18.845 21.145 18.380"),
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
                pathData = parseSvgPathData("M 8.500 4.500 L 10.648 2.352 C 11.119 1.882 11.881 1.882 12.352 2.352 L 19.648 9.648 C 20.118 10.119 20.118 10.881 19.648 11.352 L 12.056 18.944 C 10.644 20.355 8.356 20.355 6.944 18.944 L 3.056 15.056 C 1.645 13.644 1.645 11.356 3.056 9.944 L 5.670 7.330"),
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
        return _paintBucket!!
    }

private var _paintBucket: ImageVector? = null
