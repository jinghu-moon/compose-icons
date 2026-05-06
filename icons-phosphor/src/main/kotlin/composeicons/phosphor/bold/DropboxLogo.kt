package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DropboxLogo: ImageVector
    get() {
        if (_dropboxLogo != null) return _dropboxLogo!!
        _dropboxLogo = phosphorBoldIcon(
            name = "DropboxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M238.83 146.13 201.08 120 238.83 93.87c3.241-2.241 5.175-5.93 5.175-9.87 0-3.94-1.934-7.629-5.175-9.87l-52-36c-4.109-2.844-9.551-2.844-13.66 0L128 69.41 82.83 38.13c-4.109-2.844-9.551-2.844-13.66 0L17.17 74.13C13.929 76.371 11.995 80.06 11.995 84c0 3.94 1.934 7.629 5.175 9.87L54.92 120 17.17 146.13c-3.241 2.241-5.175 5.93-5.175 9.87 0 3.94 1.934 7.629 5.175 9.87l52 36c4.109 2.844 9.551 2.844 13.66 0L128 170.59l45.17 31.28c4.109 2.844 9.551 2.844 13.66 0l52-36c3.241-2.241 5.175-5.93 5.175-9.87 0-3.94-1.934-7.629-5.175-9.87ZM128 141.41 97.08 120 128 98.59 158.92 120ZM180 62.6 210.92 84 180 105.4 149.08 84ZM76 62.6 106.92 84 76 105.4 45.08 84ZM76 177.4 45.08 156 76 134.6 106.92 156ZM180 177.4 149.08 156 180 134.6 210.92 156ZM154.73 209.49c3.782 5.44 2.439 12.916-3 16.7l-16.86 11.68c-4.109 2.844-9.551 2.844-13.66 0L104.35 226.19c-3.653-2.386-5.722-6.567-5.405-10.919 .317-4.351 2.971-8.188 6.932-10.019 3.96-1.831 8.602-1.369 12.123 1.208l10 6.94 10-6.94c2.618-1.823 5.855-2.528 8.994-1.959 3.139 .569 5.923 2.364 7.736 4.989Z"),
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
        return _dropboxLogo!!
    }

private var _dropboxLogo: ImageVector? = null
