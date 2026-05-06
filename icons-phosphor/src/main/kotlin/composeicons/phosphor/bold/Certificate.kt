package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Certificate: ImageVector
    get() {
        if (_certificate != null) return _certificate!!
        _certificate = phosphorBoldIcon(
            name = "Certificate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 140c0 6.627-5.373 12-12 12h-44c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h44c6.627 0 12 5.373 12 12ZM116 88h-44c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h44c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM236 167.14v60.86c-0 4.277-2.277 8.23-5.975 10.377-3.699 2.147-8.261 2.163-11.975 .043L196 225.82l-22 12.6c-3.717 2.146-8.297 2.143-12.012-.007C158.273 236.263 155.99 232.292 156 228v-24h-116C28.954 204 20 195.046 20 184v-128C20 44.954 28.954 36 40 36h176c11.046 0 20 8.954 20 20v32.86c21.335 21.732 21.335 56.548 0 78.28ZM196 160c17.673 0 32-14.327 32-32C228 110.327 213.673 96 196 96c-17.673 0-32 14.327-32 32 0 17.673 14.327 32 32 32ZM156 180v-12.86C138.195 148.894 134.961 120.924 148.133 99.096 161.305 77.268 187.558 67.092 212 74.34v-14.34h-168v120ZM212 207.32v-25.66c-10.439 3.12-21.561 3.12-32 0v25.66l10.05-5.74c3.687-2.105 8.213-2.105 11.9 0Z"),
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
        return _certificate!!
    }

private var _certificate: ImageVector? = null
