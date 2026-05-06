package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Alien: ImageVector
    get() {
        if (_alien != null) return _alien!!
        _alien = tablerFilledIcon(
            name = "Alien",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.004 2c4.942 0 8.288 2.503 8.85 6.444 .499 3.265-.275 6.597-2.163 9.308-.925 1.35-2.12 2.493-3.51 3.356-1.982 1.19-4.376 1.19-6.373-.008C7.426 20.24 6.238 19.103 5.319 17.76 3.422 15.054 2.644 11.72 3.148 8.454 3.712 4.504 7.058 2 12.004 2ZM13.917 16.6c-.106-.243-.304-.434-.551-.531-.247-.097-.522-.092-.766 .014l-.146 .055c-.346 .11-.721 .09-1.054-.055l-.11-.04c-.508-.156-1.048 .112-1.232 .61-.183 .498 .054 1.053 .542 1.264 .893 .39 1.907 .39 2.8 0 .243-.106 .434-.304 .531-.551 .097-.247 .092-.522-.014-.766ZM8.613 10.21C8.196 9.887 7.6 9.944 7.251 10.34c-.349 .395-.33 .994 .042 1.367l2 2 .094 .083c.417 .323 1.013 .266 1.362-.13 .349-.395 .33-.994-.042-1.367l-2-2ZM16.707 10.293c-.391-.39-1.024-.39-1.414 0l-2 2-.083 .094c-.323 .417-.266 1.013 .13 1.362 .395 .349 .994 .33 1.367-.042l2-2 .083-.094c.309-.398 .273-.964-.083-1.32Z"),
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
        return _alien!!
    }

private var _alien: ImageVector? = null
