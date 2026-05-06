package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HeartBreak: ImageVector
    get() {
        if (_heartBreak != null) return _heartBreak!!
        _heartBreak = phosphorThinIcon(
            name = "HeartBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M178 44c-15.389-.039-30.154 6.083-41 17l-9 9-9-9C102.413 44.422 77.474 39.465 55.808 48.438 34.141 57.411 20.01 78.549 20 102c0 28.59 18 58.47 53.4 88.79 16.345 13.909 33.993 26.209 52.7 36.73 1.186 .64 2.614 .64 3.8 0 18.707-10.521 36.355-22.821 52.7-36.73C218 160.47 236 130.59 236 102 235.961 69.983 210.017 44.039 178 44ZM128 219.42C114 211.42 28 160.07 28 102 27.996 81.774 40.178 63.538 58.865 55.797c18.686-7.741 40.195-3.461 54.495 10.843l9 9L109.17 88.8c-.751 .75-1.173 1.768-1.173 2.83 0 1.062 .422 2.08 1.173 2.83l27.36 27.36-19.36 19.35c-1.563 1.563-1.563 4.097 0 5.66 1.563 1.563 4.097 1.563 5.66 0L145 124.64c1.558-1.561 1.558-4.089 0-5.65L117.66 91.63 130.82 78.47h0L142.62 66.66C156.916 52.344 178.429 48.054 197.122 55.792 215.816 63.529 228.004 81.769 228 102c0 58-86 109.46-100 117.42Z"),
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
        return _heartBreak!!
    }

private var _heartBreak: ImageVector? = null
