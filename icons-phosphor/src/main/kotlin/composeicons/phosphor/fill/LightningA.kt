package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LightningA: ImageVector
    get() {
        if (_lightningA != null) return _lightningA!!
        _lightningA = phosphorFillIcon(
            name = "LightningA",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M173.87 118.58 78.67 221.43c-2.466 2.684-6.434 3.362-9.651 1.649C65.802 221.365 64.149 217.694 65 214.15L78.67 156.59 28.67 134.15c-2.348-1.056-4.045-3.178-4.558-5.701-.513-2.523 .219-5.139 1.968-7.029L121.28 18.57c2.454-2.74 6.46-3.454 9.709-1.73 3.249 1.724 4.904 5.442 4.011 9.01L121.31 83.41l50 22.43c2.352 1.055 4.051 3.179 4.565 5.705 .514 2.526-.222 5.145-1.975 7.035ZM235.58 223.15c-1.11 .561-2.336 .852-3.58 .85-3.031 .002-5.803-1.709-7.16-4.42L215.05 200h-38.11l-9.79 19.58c-1.977 3.952-6.783 5.552-10.735 3.575-3.952-1.977-5.552-6.783-3.575-10.735l36-72c1.355-2.71 4.125-4.421 7.155-4.421 3.03 0 5.8 1.712 7.155 4.421l36 72c1.975 3.949 .377 8.751-3.57 10.73ZM207.05 184 196 161.89 184.94 184Z"),
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
        return _lightningA!!
    }

private var _lightningA: ImageVector? = null
