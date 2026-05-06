package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Rabbit: ImageVector
    get() {
        if (_rabbit != null) return _rabbit!!
        _rabbit = phosphorDuotoneIcon(
            name = "Rabbit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 188c.001 19.19-12.436 36.167-30.733 41.954-18.297 5.786-38.234-.953-49.267-16.654-9.88 14.053-27.035 21.071-43.931 17.972C67.172 228.173 53.624 215.525 49.374 198.881c-4.25-16.644 1.574-34.24 14.916-45.061C67.427 120.981 95.011 95.906 128 95.906c32.989 0 60.573 25.075 63.71 57.914 10.317 8.346 16.305 20.91 16.29 34.18Z"),
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
                pathData = parseSvgPathData("M112 164c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM156 152c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM216 188c-.001 20.836-12.439 39.659-31.605 47.83-19.166 8.172-41.36 4.114-56.395-10.31-13.479 13.006-32.911 17.757-50.871 12.439C59.169 232.641 45.458 218.075 41.233 199.827c-4.224-18.248 1.691-37.358 15.487-50.027C57.743 142.588 59.86 135.573 63 129 44 91.1 32.53 40.76 45.64 19.08 49.614 12.127 57.053 7.883 65.06 8c14.12 0 26 11.89 36.44 36.36 6.22 14.62 10.85 31.32 14 44.74 8.269-1.462 16.731-1.462 25 0 3.13-13.42 7.76-30.12 14-44.74C164.9 19.89 176.82 8 190.94 8c8.007-.117 15.446 4.127 19.42 11.08C223.47 40.76 212 91.1 193 129c3.129 6.562 5.24 13.562 6.26 20.76 10.699 9.832 16.774 23.709 16.74 38.24ZM155.89 93.63c10.376 4.348 19.584 11.076 26.88 19.64 6.643-14.798 11.617-30.29 14.83-46.19 3.49-18.13 3.15-33-.93-39.72C195.611 25.188 193.352 23.864 190.94 24c-6.61 0-14.52 9.7-21.72 26.62-5.93 13.94-10.35 30.12-13.33 43.01ZM73.23 113.27c7.296-8.564 16.504-15.292 26.88-19.64C97.11 80.74 92.71 64.56 86.78 50.63 79.58 33.7 71.67 24 65.06 24c-2.412-.136-4.671 1.188-5.73 3.36C55.25 34.1 54.91 49 58.4 67.08c3.213 15.9 8.187 31.392 14.83 46.19ZM200 188c.027-10.873-4.88-21.171-13.34-28-1.664-1.352-2.716-3.315-2.92-5.45C180.964 125.844 156.84 103.94 128 103.94c-28.84 0-52.964 21.904-55.74 50.61-.204 2.135-1.256 4.098-2.92 5.45-10.346 8.257-15.326 21.525-12.969 34.55 2.358 13.025 11.673 23.706 24.257 27.812 12.584 4.106 26.406 .976 35.992-8.152l-9.74-8.09c-3.397-2.828-3.858-7.873-1.03-11.27 2.828-3.397 7.873-3.858 11.27-1.03L128 202.9l10.88-9.05c3.397-2.828 8.442-2.367 11.27 1.03 2.828 3.397 2.367 8.442-1.03 11.27l-9.74 8.09c10.466 9.81 25.756 12.471 38.921 6.773C191.465 215.314 199.99 202.345 200 188Z"),
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
        return _rabbit!!
    }

private var _rabbit: ImageVector? = null
