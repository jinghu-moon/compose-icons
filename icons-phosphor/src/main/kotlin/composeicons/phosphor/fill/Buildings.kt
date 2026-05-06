package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Buildings: ImageVector
    get() {
        if (_buildings != null) return _buildings!!
        _buildings = phosphorFillIcon(
            name = "Buildings",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M239.73 208h-15.73v-112c0-8.837-7.163-16-16-16h-44c-2.209 0-4 1.791-4 4v124h-16v-175.59c.054-5.05-2.218-9.844-6.16-13-5.439-4.241-12.983-4.519-18.72-.69L39.12 72C34.663 74.974 31.99 79.982 32 85.34v122.66h-15.73c-4.289-.063-7.898 3.197-8.27 7.47-.147 2.212 .631 4.386 2.147 6.003 1.517 1.617 3.636 2.532 5.853 2.527h224c2.217 .005 4.336-.91 5.853-2.527 1.516-1.617 2.294-3.791 2.147-6.003-.372-4.273-3.981-7.533-8.27-7.47ZM76 184c.005 2.217-.91 4.336-2.527 5.853-1.617 1.516-3.791 2.294-6.003 2.147-4.277-.372-7.539-3.987-7.47-8.28v-15.45c-.058-4.287 3.199-7.893 7.47-8.27 2.212-.147 4.386 .631 6.003 2.147 1.617 1.517 2.532 3.636 2.527 5.853ZM76 128c.005 2.217-.91 4.336-2.527 5.853-1.617 1.516-3.791 2.294-6.003 2.147-4.275-.377-7.534-3.989-7.47-8.28v-15.45c-.058-4.287 3.199-7.893 7.47-8.27 2.212-.147 4.386 .631 6.003 2.147 1.617 1.517 2.532 3.636 2.527 5.853ZM116 184c.005 2.217-.91 4.336-2.527 5.853-1.617 1.516-3.791 2.294-6.003 2.147-4.269-.372-7.528-3.975-7.47-8.26v-15.47c-.053-4.283 3.203-7.884 7.47-8.26 2.212-.147 4.386 .631 6.003 2.147 1.617 1.516 2.532 3.636 2.527 5.853ZM116 128c.005 2.217-.91 4.336-2.527 5.853-1.617 1.516-3.791 2.294-6.003 2.147-4.267-.376-7.523-3.977-7.47-8.26v-15.47c-.053-4.283 3.203-7.884 7.47-8.26 2.212-.147 4.386 .631 6.003 2.147 1.617 1.517 2.532 3.636 2.527 5.853Z"),
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
        return _buildings!!
    }

private var _buildings: ImageVector? = null
