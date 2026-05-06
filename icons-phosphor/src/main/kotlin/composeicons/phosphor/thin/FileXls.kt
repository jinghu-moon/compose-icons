package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileXls: ImageVector
    get() {
        if (_fileXls != null) return _fileXls!!
        _fileXls = phosphorThinIcon(
            name = "FileXls",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 208c0 2.209-1.791 4-4 4h-28c-2.209 0-4-1.791-4-4v-56c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v52h24c2.209 0 4 1.791 4 4ZM90.32 148.75c-1.795-1.286-4.293-.874-5.58 .92L68 173.12 51.25 149.67c-1.307-1.736-3.761-2.112-5.527-.846-1.766 1.266-2.198 3.711-.973 5.506L63.08 180 44.75 205.67c-.617 .863-.865 1.936-.691 2.983 .174 1.046 .757 1.981 1.621 2.597 .674 .491 1.486 .754 2.32 .75 1.289-0 2.499-.622 3.25-1.67L68 186.88l16.74 23.45c.753 1.051 1.967 1.673 3.26 1.67 .834 .004 1.646-.259 2.32-.75 .863-.617 1.446-1.551 1.621-2.597 .174-1.046-.074-2.119-.691-2.983L72.91 180 91.25 154.33c.617-.863 .865-1.936 .691-2.983-.174-1.046-.757-1.981-1.621-2.597ZM190.49 175.15c-10.53-3-15.08-4.91-14.43-10.08 .188-2.624 1.57-5.017 3.75-6.49 6.26-4.23 18.77-2.24 23.07-1.11 2.101 .458 4.188-.826 4.726-2.907 .538-2.082-.666-4.216-2.726-4.833-3.44-.838-6.947-1.377-10.48-1.61-8.11-.54-14.54 .75-19.09 3.82-4.088 2.771-6.734 7.215-7.22 12.13-1.59 12.49 10.46 16 20.14 18.77 11.25 3.25 16.46 5.49 15.63 11.94-.197 2.729-1.635 5.216-3.9 6.75-6.28 4.17-18.61 2.05-22.83 .88-1.395-.446-2.922-.094-3.981 .918-1.059 1.012-1.48 2.521-1.099 3.935 .382 1.414 1.505 2.506 2.929 2.847 4.64 1.218 9.413 1.853 14.21 1.89 5.17 0 10.83-.86 15.22-3.77 4.201-2.824 6.924-7.373 7.43-12.41C213.63 181.84 200.26 178 190.49 175.15ZM204 92h-52c-2.209 0-4-1.791-4-4v-52h-92c-2.209 0-4 1.791-4 4v72c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-72C44 33.373 49.373 28 56 28h96c1.061-.001 2.079 .42 2.83 1.17l56 56c.75 .751 1.171 1.769 1.17 2.83v24c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4ZM198.35 84 156 41.65v42.35Z"),
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
        return _fileXls!!
    }

private var _fileXls: ImageVector? = null
