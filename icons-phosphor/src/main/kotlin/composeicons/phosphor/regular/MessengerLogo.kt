package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MessengerLogo: ImageVector
    get() {
        if (_messengerLogo != null) return _messengerLogo!!
        _messengerLogo = phosphorRegularIcon(
            name = "MessengerLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M181.66 106.34c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66l-32 32c-1.501 1.502-3.537 2.346-5.66 2.346-2.123 0-4.159-.844-5.66-2.346L112 123.31 85.66 149.66c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32l32-32c1.501-1.502 3.537-2.346 5.66-2.346 2.123 0 4.159 .844 5.66 2.346L144 132.69l26.34-26.35c1.501-1.502 3.537-2.346 5.66-2.346 2.123 0 4.159 .844 5.66 2.346ZM232 128c.008 36.523-19.143 70.373-50.453 89.178-31.31 18.805-70.189 19.808-102.427 2.642L45.07 231.17c-5.75 1.918-12.09 .421-16.375-3.865-4.286-4.286-5.782-10.626-3.865-16.375L36.18 176.88C15.859 138.673 21.32 91.875 49.893 59.375 78.466 26.874 124.179 15.463 164.674 30.723 205.169 45.984 231.982 84.725 232 128ZM216 128C215.99 91.003 192.84 57.964 158.069 45.322 123.299 32.68 84.335 43.136 60.565 71.487 36.796 99.838 33.297 140.028 51.81 172.06c1.147 1.985 1.387 4.366 .66 6.54L40 216 77.4 203.52c2.175-.724 4.557-.48 6.54 .67 27.228 15.749 60.791 15.767 88.036 .048C199.221 188.52 216.005 159.454 216 128Z"),
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
        return _messengerLogo!!
    }

private var _messengerLogo: ImageVector? = null
