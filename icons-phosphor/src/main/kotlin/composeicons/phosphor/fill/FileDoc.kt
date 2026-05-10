package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileDoc: ImageVector
    get() {
        if (_fileDoc != null) return _fileDoc!!
        _fileDoc = phosphorFillIcon(
            name = "FileDoc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M44 120h168.07c2.209 0 4-1.791 4-4v-28c.002-2.122-.84-4.158-2.34-5.66l-56-56C156.224 24.835 154.179 23.993 152.05 24h-96.05C47.163 24 40 31.163 40 40v76c0 2.209 1.791 4 4 4ZM152 44l44 44h-44ZM52 144h-16c-4.418 0-8 3.582-8 8v56c0 4.418 3.582 8 8 8h15.33C71 216 87.55 200.52 88 180.87c.234-9.698-3.455-19.079-10.232-26.02C70.992 147.909 61.7 143.997 52 144ZM51.51 200h-7.51v-40h8c5.44-.004 10.648 2.208 14.421 6.127 3.774 3.919 5.788 9.206 5.579 14.643C71.59 191.59 62.35 200 51.52 200ZM222.18 195.72c2.652 3.332 2.336 8.134-.73 11.09-5.605 5.82-13.32 9.134-21.4 9.19-17.65 0-32-16.15-32-36 0-19.85 14.36-36 32-36 8.08 .056 15.795 3.37 21.4 9.19 3.066 2.956 3.382 7.758 .73 11.09-1.463 1.738-3.595 2.772-5.865 2.844-2.27 .072-4.464-.823-6.035-2.464-2.622-2.891-6.318-4.576-10.22-4.66-8.82 0-16 9-16 20 0 11 7.18 20 16 20 3.904-.086 7.603-1.77 10.23-4.66 1.571-1.641 3.765-2.537 6.035-2.464 2.27 .072 4.403 1.107 5.865 2.844ZM128 144c-17.65 0-32 16.15-32 36 0 19.85 14.37 36 32 36 17.63 0 32-16.15 32-36 0-19.85-14.31-36-32-36ZM128 200c-8.83 0-16-9-16-20 0-11 7.18-20 16-20 8.82 0 16 9 16 20 0 11-7.14 20-16 20Z"),
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
