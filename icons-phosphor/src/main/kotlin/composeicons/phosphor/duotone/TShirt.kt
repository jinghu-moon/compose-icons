package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TShirt: ImageVector
    get() {
        if (_tShirt != null) return _tShirt!!
        _tShirt = phosphorDuotoneIcon(
            name = "TShirt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M247.11 78.77l-19.27 36.81c-1.489 2.748-4.374 4.449-7.5 4.42h-28.34v-80l51.78 28.25c3.821 1.988 5.311 6.695 3.33 10.52ZM8.89 78.77l19.27 36.81c1.489 2.748 4.374 4.449 7.5 4.42h28.34v-80L12.22 68.25C8.399 70.238 6.909 74.945 8.89 78.77Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M247.59 61.22 195.83 33c-1.173-.649-2.49-.993-3.83-1h-32c-4.418 0-8 3.582-8 8 0 13.255-10.745 24-24 24C114.745 64 104 53.255 104 40c0-4.418-3.582-8-8-8h-32c-1.344 .006-2.664 .349-3.84 1L8.41 61.22C.729 65.279-2.218 74.788 1.82 82.48l19.27 36.81c2.856 5.395 8.476 8.752 14.58 8.71h20.33v80c0 8.837 7.163 16 16 16h112c8.837 0 16-7.163 16-16v-80h20.34c6.104 .042 11.724-3.315 14.58-8.71L254.19 82.48c4.037-7.694 1.085-17.204-6.6-21.26ZM35.67 112c-.148 .007-.293-.039-.41-.13L16.09 75.26 56 53.48v58.52ZM184 208h-112v-160h16.8c3.805 18.619 20.186 31.991 39.19 31.991 19.004 0 35.385-13.372 39.19-31.991h16.82ZM220.75 111.86c-.112 .101-.26 .151-.41 .14h-20.34v-58.52l39.92 21.78Z"),
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
        return _tShirt!!
    }

private var _tShirt: ImageVector? = null
