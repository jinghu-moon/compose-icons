package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GooglePlayLogo: ImageVector
    get() {
        if (_googlePlayLogo != null) return _googlePlayLogo!!
        _googlePlayLogo = phosphorLightIcon(
            name = "GooglePlayLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M238.84 115.93 71 19.89c-4.362-2.547-9.758-2.547-14.12 0C52.591 22.347 49.96 26.927 50 31.87v192.26c-.017 4.937 2.628 9.5 6.92 11.94 4.362 2.547 9.758 2.547 14.12 0l167.8-96c4.416-2.41 7.164-7.039 7.164-12.07 0-5.031-2.748-9.66-7.164-12.07ZM62 217.5v-179L151.51 128ZM160 136.5l22.19 22.19L78.4 218.07ZM78.4 37.93 182.19 97.33 160 119.52ZM233 129.58l-.1 .06L193 152.49 168.49 128 193 103.51l39.94 22.85 .1 .06c.603 .296 .985 .909 .985 1.58 0 .671-.382 1.284-.985 1.58Z"),
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
        return _googlePlayLogo!!
    }

private var _googlePlayLogo: ImageVector? = null
