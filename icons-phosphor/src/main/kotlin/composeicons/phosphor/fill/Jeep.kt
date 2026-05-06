package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Jeep: ImageVector
    get() {
        if (_jeep != null) return _jeep!!
        _jeep = phosphorFillIcon(
            name = "Jeep",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248 103.47c-.367-4.275-3.979-7.538-8.27-7.47h-7.73c-.001-.565-.061-1.128-.18-1.68L221.18 44.65C219.572 37.287 213.067 32.028 205.53 32h-155.06c-7.537 .028-14.042 5.287-15.65 12.65L24.18 94.32c-.119 .552-.179 1.115-.18 1.68h-7.73C11.979 95.932 8.367 99.195 8 103.47c-.147 2.212 .631 4.386 2.147 6.003 1.517 1.617 3.636 2.532 5.853 2.527h8v88c0 8.837 7.163 16 16 16h24c8.837 0 16-7.163 16-16v-16h20c2.209 0 4-1.791 4-4v-51.73c-.058-4.283 3.202-7.883 7.47-8.25 2.212-.147 4.386 .631 6.003 2.147 1.617 1.517 2.532 3.636 2.527 5.853v52c0 2.209 1.791 4 4 4h8c2.209 0 4-1.791 4-4v-51.75c-.058-4.283 3.202-7.883 7.47-8.25 2.212-.147 4.386 .631 6.003 2.147 1.617 1.517 2.532 3.636 2.527 5.853v52c0 2.209 1.791 4 4 4h20v16c0 8.837 7.163 16 16 16h24c8.837 0 16-7.163 16-16v-88.02h8c2.217 .005 4.336-.91 5.853-2.527 1.516-1.617 2.294-3.791 2.147-6.003ZM68 144c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM188 144c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM40.18 96 50.47 48h155.06l10.29 48Z"),
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
        return _jeep!!
    }

private var _jeep: ImageVector? = null
