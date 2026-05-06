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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 34h-112C51.013 34 34 51.013 34 72v120c0 20.987 17.013 38 38 38h88c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-88C57.641 218 46 206.359 46 192v-10h138c20.987 0 38-17.013 38-38v-72C222 51.013 204.987 34 184 34ZM210 144c0 14.359-11.641 26-26 26h-138v-98C46 57.641 57.641 46 72 46h112c14.359 0 26 11.641 26 26ZM182 104v32c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-32c0-9.941-8.059-18-18-18-9.941 0-18 8.059-18 18v32c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-32c0-9.941-8.059-18-18-18-9.941 0-18 8.059-18 18v32c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-32C74 91.087 82.263 79.623 94.513 75.539 106.763 71.456 120.252 75.67 128 86c7.748-10.33 21.237-14.544 33.487-10.461C173.737 79.623 182 91.087 182 104Z"),
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
        return _mastodonLogo!!
    }

private var _mastodonLogo: ImageVector? = null
