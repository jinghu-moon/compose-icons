package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ShieldCheckered: ImageVector
    get() {
        if (_shieldCheckered != null) return _shieldCheckered!!
        _shieldCheckered = tablerFilledIcon(
            name = "ShieldCheckered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.013 12v9.754C6.558 20.313 3.222 16.587 2.28 12h8.734ZM20.297 15.794c-1.6 2.823-4.198 4.946-7.283 5.951L13.013 12h8.708c-.273 1.332-.753 2.612-1.424 3.794ZM11.014 2.526 11.013 10h-8.986C1.959 8.568 2.128 7.12 2.541 5.718c.13-.442 .545-.738 1.005-.717 2.588 .118 5.135-.68 7.192-2.256l.276-.219ZM13.013 10v-7.453l-.09-.073c2.017 1.676 4.567 2.575 7.189 2.537l.342-.01c.46-.021 .875 .275 1.005 .717 .413 1.403 .582 2.85 .514 4.282h-8.96Z"),
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
        return _shieldCheckered!!
    }

private var _shieldCheckered: ImageVector? = null
