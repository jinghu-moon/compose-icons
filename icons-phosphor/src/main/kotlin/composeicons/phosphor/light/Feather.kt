package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Feather: ImageVector
    get() {
        if (_feather != null) return _feather!!
        _feather = phosphorLightIcon(
            name = "Feather",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M238 80C237.999 54.929 222.9 32.326 199.739 22.726 176.579 13.127 149.916 18.42 132.18 36.14L62.1 105.41c-2.631 2.622-4.107 6.186-4.1 9.9v74.21L27.76 219.76c-1.605 1.496-2.266 3.748-1.723 5.874 .543 2.126 2.203 3.786 4.329 4.329 2.126 .543 4.379-.118 5.874-1.723L66.48 198h74.21c3.714 .007 7.278-1.469 9.9-4.1h0l68.83-69.63h0l.39-.4C231.493 112.266 238.044 96.467 238 80ZM140.64 44.64c19.291-19.133 50.331-19.359 69.899-.509 19.568 18.85 20.501 49.877 2.101 69.869h-62.16L188.24 76.24c2.203-2.364 2.138-6.048-.147-8.333-2.285-2.285-5.969-2.35-8.333-.147l-48 48h0L118 129.52v-62.52ZM70 115.31c-.001-.518 .2-1.017 .56-1.39L106 78.92v62.63l-36 36ZM142.09 185.42c-.373 .369-.875 .578-1.4 .58h-62.21l37.76-37.75h0L138.48 126h62.35Z"),
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
        return _feather!!
    }

private var _feather: ImageVector? = null
