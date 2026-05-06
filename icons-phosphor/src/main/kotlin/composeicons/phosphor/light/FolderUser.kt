package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FolderUser: ImageVector
    get() {
        if (_folderUser != null) return _folderUser!!
        _folderUser = phosphorLightIcon(
            name = "FolderUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M211.28 199c9.663-8.106 13.224-21.39 8.912-33.243C215.879 153.905 204.613 146.016 192 146.016c-12.613 0-23.879 7.889-28.192 19.742-4.313 11.853-.752 25.137 8.912 33.243-9.12 4.979-15.811 13.468-18.52 23.5-.409 1.538-.189 3.176 .609 4.552 .799 1.377 2.112 2.379 3.651 2.788 .503 .13 1.02 .198 1.54 .2 2.721 0 5.102-1.83 5.8-4.46C168.86 214 179.63 206 192 206c12.37 0 23.14 8 26.2 19.54 .853 3.203 4.142 5.108 7.345 4.255 3.203-.853 5.108-4.142 4.255-7.345C227.078 212.437 220.39 203.968 211.28 199ZM192 158c9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18ZM216 74h-85.52L102.59 46.1C99.968 43.469 96.404 41.993 92.69 42h-52.69C32.268 42 26 48.268 26 56v144.61c.006 7.389 5.991 13.379 13.38 13.39h81.18c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-81.18c-.762-.011-1.375-.628-1.38-1.39v-114.61h178c1.105 0 2 .895 2 2v32c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-32c0-7.732-6.268-14-14-14ZM40 54h52.69c.53 .002 1.037 .214 1.41 .59L113.51 74h-75.51v-18c0-1.105 .895-2 2-2Z"),
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
        return _folderUser!!
    }

private var _folderUser: ImageVector? = null
