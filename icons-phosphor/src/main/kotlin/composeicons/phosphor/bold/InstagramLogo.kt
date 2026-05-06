package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.InstagramLogo: ImageVector
    get() {
        if (_instagramLogo != null) return _instagramLogo!!
        _instagramLogo = phosphorBoldIcon(
            name = "InstagramLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 80c-26.51 0-48 21.49-48 48 0 26.51 21.49 48 48 48 26.51 0 48-21.49 48-48C175.972 101.502 154.498 80.028 128 80ZM128 152c-13.255 0-24-10.745-24-24 0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24ZM176 20h-96C46.879 20.039 20.039 46.879 20 80v96c.039 33.121 26.879 59.961 60 60h96c33.121-.039 59.961-26.879 60-60v-96C235.961 46.879 209.121 20.039 176 20ZM212 176c0 19.882-16.118 36-36 36h-96C60.118 212 44 195.882 44 176v-96C44 60.118 60.118 44 80 44h96c19.882 0 36 16.118 36 36ZM196 76c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16Z"),
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
        return _instagramLogo!!
    }

private var _instagramLogo: ImageVector? = null
