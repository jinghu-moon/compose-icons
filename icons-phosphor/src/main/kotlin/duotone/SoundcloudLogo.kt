package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SoundcloudLogo: ImageVector
    get() {
        if (_soundcloudLogo != null) return _soundcloudLogo!!
        _soundcloudLogo = phosphorDuotoneIcon(
            name = "SoundcloudLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 248.000 152.000 C 248.000 174.091 230.091 192.000 208.000 192.000 L 144.000 192.000 L 144.000 48.000 C 180.952 47.996 211.909 75.966 215.640 112.730 C 234.436 116.387 248.003 132.852 248.000 152.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 24.000 120.000 L 24.000 168.000 C 24.000 172.418 20.418 176.000 16.000 176.000 C 11.582 176.000 8.000 172.418 8.000 168.000 L 8.000 120.000 C 8.000 115.582 11.582 112.000 16.000 112.000 C 20.418 112.000 24.000 115.582 24.000 120.000 ZM 48.000 88.000 C 43.582 88.000 40.000 91.582 40.000 96.000 L 40.000 192.000 C 40.000 196.418 43.582 200.000 48.000 200.000 C 52.418 200.000 56.000 196.418 56.000 192.000 L 56.000 96.000 C 56.000 91.582 52.418 88.000 48.000 88.000 ZM 80.000 80.000 C 75.582 80.000 72.000 83.582 72.000 88.000 L 72.000 192.000 C 72.000 196.418 75.582 200.000 80.000 200.000 C 84.418 200.000 88.000 196.418 88.000 192.000 L 88.000 88.000 C 88.000 83.582 84.418 80.000 80.000 80.000 ZM 112.000 48.000 C 107.582 48.000 104.000 51.582 104.000 56.000 L 104.000 192.000 C 104.000 196.418 107.582 200.000 112.000 200.000 C 116.418 200.000 120.000 196.418 120.000 192.000 L 120.000 56.000 C 120.000 51.582 116.418 48.000 112.000 48.000 ZM 222.840 106.340 C 216.195 67.994 182.918 39.993 144.000 40.000 C 139.582 40.000 136.000 43.582 136.000 48.000 C 136.000 52.418 139.582 56.000 144.000 56.000 C 176.887 55.884 204.467 80.800 207.680 113.530 C 208.056 117.025 210.669 119.865 214.120 120.530 C 230.456 123.536 241.776 138.540 240.182 155.073 C 238.587 171.606 224.609 184.171 208.000 184.000 L 144.000 184.000 C 139.582 184.000 136.000 187.582 136.000 192.000 C 136.000 196.418 139.582 200.000 144.000 200.000 L 208.000 200.000 C 231.623 200.018 251.748 182.844 255.444 159.512 C 259.141 136.179 245.312 113.626 222.840 106.340 Z"),
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
        return _soundcloudLogo!!
    }

private var _soundcloudLogo: ImageVector? = null
