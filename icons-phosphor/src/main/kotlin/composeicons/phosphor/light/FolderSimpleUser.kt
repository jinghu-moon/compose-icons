package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FolderSimpleUser: ImageVector
    get() {
        if (_folderSimpleUser != null) return _folderSimpleUser!!
        _folderSimpleUser = phosphorLightIcon(
            name = "FolderSimpleUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M211.28 199c9.663-8.106 13.224-21.39 8.912-33.243C215.879 153.905 204.613 146.016 192 146.016c-12.613 0-23.879 7.889-28.192 19.742-4.313 11.853-.752 25.137 8.912 33.243-9.12 4.979-15.811 13.468-18.52 23.5-.409 1.538-.189 3.176 .609 4.552 .799 1.377 2.112 2.379 3.651 2.788 .503 .13 1.02 .198 1.54 .2 2.721 0 5.102-1.83 5.8-4.46C168.86 214 179.63 206 192 206c12.37 0 23.14 8 26.2 19.54 .851 3.203 4.137 5.111 7.34 4.26 3.203-.851 5.111-4.137 4.26-7.34C227.081 212.443 220.392 203.97 211.28 199ZM192 158c9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18ZM230 88v32c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-32c0-1.105-.895-2-2-2h-85.33c-3.029 0-5.977-.982-8.4-2.8L94.53 62.4C94.184 62.14 93.763 62 93.33 62h-53.33c-1.105 0-2 .895-2 2v136c0 1.105 .895 2 2 2h80c3.314 0 6 2.686 6 6 0 3.314-2.686 6-6 6h-80c-7.732 0-14-6.268-14-14v-136C26 56.268 32.268 50 40 50h53.33c3.029 0 5.977 .982 8.4 2.8l27.74 20.8c.346 .26 .767 .4 1.2 .4h85.33c7.732 0 14 6.268 14 14Z"),
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
        return _folderSimpleUser!!
    }

private var _folderSimpleUser: ImageVector? = null
