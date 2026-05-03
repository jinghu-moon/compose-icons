package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MastodonLogo: ImageVector
    get() {
        if (_mastodonLogo != null) return _mastodonLogo!!
        _mastodonLogo = phosphorLightIcon(
            name = "MastodonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 184.000 34.000 L 72.000 34.000 C 51.013 34.000 34.000 51.013 34.000 72.000 L 34.000 192.000 C 34.000 212.987 51.013 230.000 72.000 230.000 L 160.000 230.000 C 163.314 230.000 166.000 227.314 166.000 224.000 C 166.000 220.686 163.314 218.000 160.000 218.000 L 72.000 218.000 C 57.641 218.000 46.000 206.359 46.000 192.000 L 46.000 182.000 L 184.000 182.000 C 204.987 182.000 222.000 164.987 222.000 144.000 L 222.000 72.000 C 222.000 51.013 204.987 34.000 184.000 34.000 ZM 210.000 144.000 C 210.000 158.359 198.359 170.000 184.000 170.000 L 46.000 170.000 L 46.000 72.000 C 46.000 57.641 57.641 46.000 72.000 46.000 L 184.000 46.000 C 198.359 46.000 210.000 57.641 210.000 72.000 ZM 182.000 104.000 L 182.000 136.000 C 182.000 139.314 179.314 142.000 176.000 142.000 C 172.686 142.000 170.000 139.314 170.000 136.000 L 170.000 104.000 C 170.000 94.059 161.941 86.000 152.000 86.000 C 142.059 86.000 134.000 94.059 134.000 104.000 L 134.000 136.000 C 134.000 139.314 131.314 142.000 128.000 142.000 C 124.686 142.000 122.000 139.314 122.000 136.000 L 122.000 104.000 C 122.000 94.059 113.941 86.000 104.000 86.000 C 94.059 86.000 86.000 94.059 86.000 104.000 L 86.000 136.000 C 86.000 139.314 83.314 142.000 80.000 142.000 C 76.686 142.000 74.000 139.314 74.000 136.000 L 74.000 104.000 C 74.000 91.087 82.263 79.623 94.513 75.539 C 106.763 71.456 120.252 75.670 128.000 86.000 C 135.748 75.670 149.237 71.456 161.487 75.539 C 173.737 79.623 182.000 91.087 182.000 104.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _mastodonLogo!!
    }

private var _mastodonLogo: ImageVector? = null
