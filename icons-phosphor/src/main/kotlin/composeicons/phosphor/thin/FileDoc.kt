package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FileDoc: ImageVector
    get() {
        if (_fileDoc != null) return _fileDoc!!
        _fileDoc = phosphorThinIcon(
            name = "FileDoc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M52 148h-16c-2.209 0-4 1.791-4 4v56c0 2.209 1.791 4 4 4h16c17.673 0 32-14.327 32-32C84 162.327 69.673 148 52 148ZM52 204h-12v-48h12c13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24ZM218.77 198c.767 .734 1.211 1.743 1.234 2.805 .023 1.062-.378 2.089-1.114 2.855-4.883 5.258-11.715 8.274-18.89 8.34-15.44 0-28-14.36-28-32 0-17.64 12.56-32 28-32 7.178 .071 14.01 3.095 18.89 8.36 1.53 1.596 1.476 4.13-.12 5.66-1.596 1.53-4.13 1.476-5.66-.12C209.738 158.213 204.996 156.078 200 156c-11 0-20 10.77-20 24 0 13.23 9 24 20 24 4.996-.078 9.738-2.213 13.11-5.9 .737-.765 1.748-1.205 2.809-1.223 1.062-.019 2.087 .385 2.851 1.123ZM128 148c-15.44 0-28 14.36-28 32 0 17.64 12.56 32 28 32 15.44 0 28-14.36 28-32 0-17.64-12.56-32-28-32ZM128 204c-11 0-20-10.77-20-24 0-13.23 9-24 20-24 11 0 20 10.77 20 24 0 13.23-9 24-20 24ZM48 116c2.209 0 4-1.791 4-4v-72c0-2.209 1.791-4 4-4h92v52c0 2.209 1.791 4 4 4h52v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-24c.001-1.061-.42-2.079-1.17-2.83l-56-56C154.079 28.42 153.061 27.999 152 28h-96C49.373 28 44 33.373 44 40v72c0 2.209 1.791 4 4 4ZM156 41.65 198.34 84h-42.34Z"),
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
        return _fileDoc!!
    }

private var _fileDoc: ImageVector? = null
