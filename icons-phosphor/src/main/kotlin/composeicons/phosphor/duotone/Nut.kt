package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Nut: ImageVector
    get() {
        if (_nut != null) return _nut!!
        _nut = phosphorDuotoneIcon(
            name = "Nut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M219.84 73.16 131.84 25c-2.393-1.309-5.287-1.309-7.68 0L36.16 73.18c-2.559 1.4-4.153 4.083-4.16 7v95.64c.007 2.917 1.601 5.6 4.16 7L124.16 231c2.393 1.309 5.287 1.309 7.68 0l88-48.18c2.559-1.4 4.153-4.083 4.16-7v-95.64c.001-2.924-1.594-5.616-4.16-7.02ZM128 168C105.909 168 88 150.091 88 128c0-22.091 17.909-40 40-40 22.091 0 40 17.909 40 40 0 22.091-17.909 40-40 40Z"),
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
                pathData = parseSvgPathData("M128 80c-26.51 0-48 21.49-48 48 0 26.51 21.49 48 48 48 26.51 0 48-21.49 48-48C175.967 101.504 154.496 80.033 128 80ZM128 160C110.327 160 96 145.673 96 128c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32ZM223.68 66.15 135.68 18c-4.779-2.641-10.581-2.641-15.36 0l-88 48.17c-5.119 2.801-8.307 8.165-8.32 14v95.64c.013 5.835 3.201 11.199 8.32 14l88 48.17c4.779 2.641 10.581 2.641 15.36 0l88-48.17h0c5.119-2.801 8.307-8.165 8.32-14v-95.63c-.002-5.845-3.192-11.224-8.32-14.03ZM128 224 40 175.82v-95.64L128 32l88 48.17v95.63Z"),
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
        return _nut!!
    }

private var _nut: ImageVector? = null
