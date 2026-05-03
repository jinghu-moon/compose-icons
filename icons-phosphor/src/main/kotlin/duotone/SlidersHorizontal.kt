package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SlidersHorizontal: ImageVector
    get() {
        if (_slidersHorizontal != null) return _slidersHorizontal!!
        _slidersHorizontal = phosphorDuotoneIcon(
            name = "SlidersHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 128.000 80.000 C 128.000 93.255 117.255 104.000 104.000 104.000 C 90.745 104.000 80.000 93.255 80.000 80.000 C 80.000 66.745 90.745 56.000 104.000 56.000 C 117.255 56.000 128.000 66.745 128.000 80.000 ZM 168.000 152.000 C 154.745 152.000 144.000 162.745 144.000 176.000 C 144.000 189.255 154.745 200.000 168.000 200.000 C 181.255 200.000 192.000 189.255 192.000 176.000 C 192.000 162.745 181.255 152.000 168.000 152.000 Z"),
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
                pathData = parseSvgPathData("M 40.000 88.000 L 73.000 88.000 C 76.625 102.159 89.384 112.063 104.000 112.063 C 118.616 112.063 131.375 102.159 135.000 88.000 L 216.000 88.000 C 220.418 88.000 224.000 84.418 224.000 80.000 C 224.000 75.582 220.418 72.000 216.000 72.000 L 135.000 72.000 C 131.375 57.841 118.616 47.937 104.000 47.937 C 89.384 47.937 76.625 57.841 73.000 72.000 L 40.000 72.000 C 35.582 72.000 32.000 75.582 32.000 80.000 C 32.000 84.418 35.582 88.000 40.000 88.000 ZM 104.000 64.000 C 112.837 64.000 120.000 71.163 120.000 80.000 C 120.000 88.837 112.837 96.000 104.000 96.000 C 95.163 96.000 88.000 88.837 88.000 80.000 C 88.000 71.163 95.163 64.000 104.000 64.000 ZM 216.000 168.000 L 199.000 168.000 C 195.375 153.841 182.616 143.937 168.000 143.937 C 153.384 143.937 140.625 153.841 137.000 168.000 L 40.000 168.000 C 35.582 168.000 32.000 171.582 32.000 176.000 C 32.000 180.418 35.582 184.000 40.000 184.000 L 137.000 184.000 C 140.625 198.159 153.384 208.063 168.000 208.063 C 182.616 208.063 195.375 198.159 199.000 184.000 L 216.000 184.000 C 220.418 184.000 224.000 180.418 224.000 176.000 C 224.000 171.582 220.418 168.000 216.000 168.000 ZM 168.000 192.000 C 159.163 192.000 152.000 184.837 152.000 176.000 C 152.000 167.163 159.163 160.000 168.000 160.000 C 176.837 160.000 184.000 167.163 184.000 176.000 C 184.000 184.837 176.837 192.000 168.000 192.000 Z"),
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
        return _slidersHorizontal!!
    }

private var _slidersHorizontal: ImageVector? = null
