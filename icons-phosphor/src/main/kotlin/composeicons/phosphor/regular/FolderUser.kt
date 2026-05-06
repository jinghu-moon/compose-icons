package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FolderUser: ImageVector
    get() {
        if (_folderUser != null) return _folderUser!!
        _folderUser = phosphorRegularIcon(
            name = "FolderUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M214.61 198.62c9.159-9.149 11.903-22.916 6.952-34.878-4.951-11.962-16.622-19.762-29.568-19.762-12.946 0-24.617 7.8-29.568 19.762-4.951 11.962-2.207 25.728 6.953 34.878-8.412 5.367-14.515 13.685-17.11 23.32-1.138 4.269 1.401 8.652 5.67 9.79 .672 .178 1.365 .268 2.06 .27 3.628-.001 6.8-2.443 7.73-5.95C170.56 215.42 180.54 208 192 208c11.46 0 21.44 7.42 24.27 18.05 .689 2.812 2.844 5.032 5.634 5.805 2.79 .773 5.78-.022 7.818-2.078 2.038-2.056 2.806-5.053 2.008-7.836-2.597-9.637-8.704-17.955-17.12-23.32ZM192 160c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16ZM216 72h-84.69L104 44.69C101.01 41.676 96.936 39.986 92.69 40h-52.69C31.163 40 24 47.163 24 56v144.61c.006 8.493 6.887 15.379 15.38 15.39h81.18c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-80.56v-112h176v32c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-32c0-8.837-7.163-16-16-16ZM92.69 56l16 16h-68.69v-16Z"),
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
