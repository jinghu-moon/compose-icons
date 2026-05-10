package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FingerprintSimple: ImageVector
    get() {
        if (_fingerprintSimple != null) return _fingerprintSimple!!
        _fingerprintSimple = phosphorFillIcon(
            name = "FingerprintSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M126.41 24C70.72 24.85 25.21 70.07 24 125.75c-.422 18.727 4.247 37.218 13.51 53.5 .741 1.299 2.144 2.077 3.638 2.016 1.494-.061 2.83-.95 3.462-2.306C52.124 163.023 56.013 145.619 56 128 55.993 110.597 62.296 93.781 73.74 80.67c2.678-3.189 7.317-3.872 10.8-1.59 1.897 1.298 3.144 3.349 3.424 5.63C88.243 86.991 87.528 89.283 86 91c-9.019 10.216-13.997 23.373-14 37 .03 24.004-6.335 47.582-18.44 68.31-.923 1.567-.672 3.56 .61 4.85 3.97 4.025 8.261 7.72 12.83 11.05 .914 .67 2.07 .921 3.179 .69 1.11-.231 2.069-.921 2.641-1.9C77.109 203.966 80.847 196.611 84 189c1.684-4.087 6.363-6.034 10.45-4.35 4.087 1.684 6.034 6.363 4.35 10.45-3.359 8.13-7.32 15.999-11.85 23.54-.594 .996-.727 2.2-.365 3.301 .363 1.101 1.185 1.991 2.255 2.439 8.02 3.271 16.419 5.522 25 6.7 1.64 .241 3.259-.554 4.07-2 14.658-26.333 23.385-55.551 25.57-85.61 .12-2.916 1.818-5.534 4.431-6.834 2.613-1.299 5.726-1.073 8.123 .591 2.397 1.664 3.699 4.501 3.396 7.403-2.036 28.037-9.358 55.435-21.58 80.75-.651 1.319-.526 2.889 .327 4.088 .852 1.199 2.294 1.833 3.753 1.652 7.018-.943 13.92-2.601 20.6-4.95 1.063-.379 1.916-1.189 2.35-2.23C177.351 194.099 183.847 162.102 184 129.76 184.22 99.12 160.6 73.09 130 72.03c-5.388-.187-10.776 .396-16 1.73-2.133 .548-4.397 .192-6.259-.983-1.862-1.175-3.158-3.066-3.581-5.227-.724-4.302 2.036-8.422 6.29-9.39 21.518-5.388 44.318-.564 61.81 13.078C189.751 84.88 199.984 105.818 200 128c.024 25.258-3.566 50.389-10.66 74.63-.509 1.708 .174 3.547 1.674 4.509 1.5 .962 3.456 .816 4.796-.359 33.146-28.557 44.876-74.805 29.345-115.708C209.625 50.17 170.157 23.361 126.41 24ZM128 96c9.105 .008 17.776 3.887 23.85 10.67 1.505 1.683 2.229 3.924 1.993 6.17-.236 2.246-1.41 4.287-3.233 5.62-3.443 2.371-8.115 1.796-10.88-1.34-4.267-4.599-10.827-6.28-16.78-4.3-6.653 2.316-11.082 8.625-11 15.67-.028 11.076-1.096 22.124-3.19 33-.709 3.74-3.954 6.462-7.76 6.51-.503 .003-1.006-.044-1.5-.14-4.364-.992-7.155-5.265-6.31-9.66C95.074 148.244 96.015 138.133 96 128c0-17.673 14.327-32 32-32Z"),
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
        return _fingerprintSimple!!
    }

private var _fingerprintSimple: ImageVector? = null
