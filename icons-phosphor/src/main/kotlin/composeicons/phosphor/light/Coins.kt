package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Coins: ImageVector
    get() {
        if (_coins != null) return _coins!!
        _coins = phosphorLightIcon(
            name = "Coins",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224.56 103.81C213.43 97.75 198.47 93.39 182 91.34v-7.34C182 71.88 172.42 60.9 155 53.07 139.16 45.93 118.2 42 96 42 73.8 42 52.84 45.93 37 53.07 19.58 60.9 10 71.88 10 84v40c0 12.12 9.58 23.1 27 30.93 10.49 4.72 23.21 8 37 9.73v7.34c0 12.12 9.58 23.1 27 30.93 15.84 7.14 36.8 11.07 59 11.07 22.2 0 43.16-3.93 59-11.07 17.39-7.83 27-18.81 27-30.93v-40c0-10.65-7.61-20.66-21.44-28.19ZM218.82 114.35C228.61 119.68 234 126 234 132c0 14.19-30.39 30-74 30-7.091 .004-14.176-.443-21.21-1.34 5.544-1.487 10.963-3.403 16.21-5.73 17.39-7.83 27-18.81 27-30.93v-20.57c14.4 1.93 27.3 5.73 36.82 10.92ZM108.16 153.58c-3.92 .27-8 .42-12.16 .42-5.3 0-10.4-.24-15.28-.67-.123-.01-.247-.01-.37 0-3.58-.33-7-.77-10.35-1.3v-27.91c8.609 1.261 17.299 1.89 26 1.88 8.701 .01 17.391-.619 26-1.88v27.88c-4.34 .69-8.91 1.22-13.69 1.56ZM170 105.89v18.11c0 9.54-13.75 19.8-36 25.51v-27.66c7.206-1.627 14.239-3.944 21-6.92 5.378-2.336 10.422-5.376 15-9.04ZM96 54c43.61 0 74 15.81 74 30 0 14.19-30.39 30-74 30C52.39 114 22 98.19 22 84 22 69.81 52.39 54 96 54ZM22 124v-18.11c4.58 3.65 9.624 6.677 15 9 6.761 2.976 13.794 5.293 21 6.92v27.66C35.75 143.8 22 133.54 22 124ZM86 172v-6.28c3.3 .18 6.63 .28 10 .28q5.91 0 11.66-.37c4.69 1.692 9.479 3.098 14.34 4.21v27.67C99.75 191.8 86 181.54 86 172ZM134 200v-27.9c8.609 1.269 17.299 1.904 26 1.9 8.701 .01 17.391-.619 26-1.88v27.88c-17.231 2.667-34.769 2.667-52 0ZM198 197.51v-27.66c7.206-1.627 14.239-3.944 21-6.92 5.376-2.323 10.42-5.35 15-9v18.07c0 9.54-13.75 19.8-36 25.51Z"),
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
        return _coins!!
    }

private var _coins: ImageVector? = null
