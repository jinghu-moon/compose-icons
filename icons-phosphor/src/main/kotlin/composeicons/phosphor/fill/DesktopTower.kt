package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DesktopTower: ImageVector
    get() {
        if (_desktopTower != null) return _desktopTower!!
        _desktopTower = phosphorFillIcon(
            name = "DesktopTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 76v112c0 2.209-1.791 4-4 4h-20v16h15.73c4.281-.053 7.879 3.205 8.25 7.47 .147 2.212-.631 4.386-2.147 6.003-1.517 1.617-3.636 2.532-5.853 2.527h-47.71c-4.289 .063-7.898-3.197-8.27-7.47-.147-2.212 .631-4.386 2.147-6.003C59.664 208.91 61.783 207.995 64 208h16v-16h-48C18.745 192 8 181.255 8 168v-72C8 82.745 18.745 72 32 72h84c2.209 0 4 1.791 4 4ZM248 48v160c0 8.837-7.163 16-16 16h-80c-8.837 0-16-7.163-16-16v-160c0-8.837 7.163-16 16-16h80c8.837 0 16 7.163 16 16ZM203.9 181.57c.672-5.096-1.977-10.054-6.586-12.329-4.609-2.275-10.156-1.362-13.792 2.271-3.636 3.633-4.555 9.178-2.285 13.79 2.271 4.612 7.226 7.265 12.323 6.598 5.388-.705 9.63-4.943 10.34-10.33ZM224 103.47c-.372-4.273-3.981-7.533-8.27-7.47h-47.46c-4.281-.053-7.879 3.205-8.25 7.47-.147 2.212 .631 4.386 2.147 6.003 1.517 1.617 3.636 2.532 5.853 2.527h48c2.213-.001 4.328-.918 5.84-2.535 1.512-1.616 2.287-3.787 2.14-5.995ZM224 71.47c-.372-4.273-3.981-7.533-8.27-7.47h-47.46c-4.289-.063-7.898 3.197-8.27 7.47-.147 2.212 .631 4.386 2.147 6.003 1.517 1.617 3.636 2.532 5.853 2.527h48c2.217 .005 4.336-.91 5.853-2.527 1.516-1.617 2.294-3.791 2.147-6.003Z"),
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
        return _desktopTower!!
    }

private var _desktopTower: ImageVector? = null
