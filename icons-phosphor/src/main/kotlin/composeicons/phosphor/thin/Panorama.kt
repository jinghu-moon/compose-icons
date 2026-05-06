package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Panorama: ImageVector
    get() {
        if (_panorama != null) return _panorama!!
        _panorama = phosphorThinIcon(
            name = "Panorama",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M239.31 54.49c-2.945-2.285-6.792-3.055-10.39-2.08l-3.47 .93C206.47 58.47 171.14 68 128 68 84.86 68 49.53 58.47 30.55 53.34l-3.47-.93c-3.6-.956-7.439-.186-10.393 2.083C13.734 56.763 12.002 60.275 12 64v128c-.019 3.734 1.709 7.263 4.671 9.537 2.962 2.275 6.816 3.034 10.419 2.053l3.18-.85C49.27 197.58 84.64 188 128 188c43.36 0 78.73 9.58 97.73 14.73l3.18 .85c3.599 .959 7.44 .192 10.396-2.075 2.955-2.268 4.69-5.779 4.694-9.505v-128c.01-3.729-1.725-7.248-4.69-9.51ZM21.57 60.83c.697-.536 1.551-.828 2.43-.83 .338 .006 .674 .053 1 .14l3.44 .93C47.8 66.29 83.8 76 128 76c44.2 0 80.2-9.71 99.54-14.93l3.45-.93c1.197-.312 2.471-.053 3.451 .702 .98 .755 1.555 1.921 1.559 3.158v128c0 .13 0 .24 0 .37L171.15 127.52c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529l-22.83 22.83L84.49 103.51c-2.252-2.259-5.31-3.529-8.5-3.529-3.19 0-6.248 1.27-8.5 3.529L20 151v-87c.002-1.243 .582-2.415 1.57-3.17ZM28.17 195l-3.15 .85c-1.197 .316-2.472 .059-3.454-.694C20.584 194.403 20.005 193.238 20 192v-29.66L73.17 109.17c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173l71.67 71.67C143.26 180.31 135.74 180 128 180c-44.43 0-81.84 10.13-99.83 15ZM163 182 137 156l22.83-22.83c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173l61.64 61.64C214 191.25 191.11 185.14 163 182ZM196 108c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8Z"),
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
        return _panorama!!
    }

private var _panorama: ImageVector? = null
