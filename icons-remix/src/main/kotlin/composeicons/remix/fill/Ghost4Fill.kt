package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Ghost4Fill: ImageVector
    get() {
        if (_ghost4Fill != null) return _ghost4Fill!!
        _ghost4Fill = remixIcon(
            name = "Ghost4Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2.5c2.444 0 4.134 .688 5.253 1.967 1.072 1.225 1.479 2.845 1.733 4.369 .1 .601 .285 .921 .449 1.11 .169 .195 .381 .326 .666 .456 .171 .078 .274 .116 .479 .205 .167 .073 .38 .171 .581 .307 .209 .142 .433 .343 .599 .634 .168 .295 .239 .62 .239 .952 0 .586-.171 1.064-.452 1.459-.256 .359-.585 .62-.806 .795-.483 .384-.683 .557-.763 .946-.047 .232-.006 .648 .174 1.224 .17 .545 .425 1.112 .663 1.584 .548 1.086-.372 2.504-1.696 2.21l-2.297-.511c-.448-.1-.918-.041-1.329 .164l-1.705 .853c-1.126 .563-2.452 .563-3.578 0L8.506 20.371c-.411-.205-.881-.264-1.329-.164l-2.321 .517C3.543 21.015 2.617 19.618 3.158 18.529c.24-.482 .5-1.065 .676-1.621 .188-.593 .228-1.002 .187-1.208-.071-.347-.26-.513-.766-.924C2.78 14.391 2 13.752 2 12.5c0-.332 .071-.657 .239-.952 .165-.291 .389-.492 .599-.634 .201-.136 .414-.234 .581-.307 .205-.089 .308-.127 .479-.205 .286-.13 .497-.261 .666-.456 .164-.189 .349-.509 .449-1.11C5.268 7.311 5.676 5.692 6.747 4.467 7.866 3.188 9.556 2.5 12 2.5ZM10 8.5c-.69 0-1.25 .783-1.25 1.75C8.75 11.217 9.31 12 10 12c.69 0 1.25-.783 1.25-1.75C11.25 9.283 10.69 8.5 10 8.5ZM14 8.5c-.69 0-1.25 .783-1.25 1.75 0 .967 .56 1.75 1.25 1.75 .69 0 1.25-.783 1.25-1.75C15.25 9.283 14.69 8.5 14 8.5Z"),
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
        return _ghost4Fill!!
    }

private var _ghost4Fill: ImageVector? = null
