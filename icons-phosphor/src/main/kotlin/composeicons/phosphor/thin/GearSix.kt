package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GearSix: ImageVector
    get() {
        if (_gearSix != null) return _gearSix!!
        _gearSix = phosphorThinIcon(
            name = "GearSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 84c-24.301 0-44 19.699-44 44 0 24.301 19.699 44 44 44 24.301 0 44-19.699 44-44C171.972 103.711 152.289 84.028 128 84ZM128 164C108.118 164 92 147.882 92 128c0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36ZM234 108c-.238-1.15-.969-2.137-2-2.7L201.11 87.7q-.47-.82-1-1.62l-.01-34.88c-.008-1.16-.528-2.258-1.42-3C188.248 39.369 176.231 32.602 163.27 28.26c-1.069-.364-2.243-.258-3.23 .29L129 45.87h-2L96 28.51c-.986-.552-2.159-.661-3.23-.3-12.956 4.368-24.965 11.154-35.39 20-.882 .749-1.396 1.843-1.41 3l-.16 34.9-1 1.62L23.9 105.3c-.993 .584-1.685 1.568-1.9 2.7-2.62 13.205-2.62 26.795 0 40 .227 1.141 .938 2.126 1.95 2.7l30.89 17.6q.47 .83 1 1.62l.12 34.87c.008 1.16 .528 2.258 1.42 3 10.432 8.831 22.449 15.598 35.41 19.94 1.069 .364 2.243 .258 3.23-.29L127 210.13h2l31 17.36c.986 .552 2.159 .661 3.23 .3 12.956-4.368 24.965-11.154 35.39-20 .882-.749 1.396-1.843 1.41-3l.16-34.9 1-1.62 30.91-17.57c1.033-.565 1.765-1.556 2-2.71C236.686 134.782 236.652 121.195 234 108ZM226.52 144.67l-30.22 17.17c-.634 .363-1.156 .892-1.51 1.53-.61 1.09-1.25 2.17-1.91 3.24-.398 .628-.61 1.356-.61 2.1l-.16 34.15c-8.864 7.253-18.911 12.926-29.7 16.77l-30.4-17c-.612-.339-1.301-.515-2-.51h-.01c-1.28 0-2.57 0-3.84 0-.716-.012-1.423 .164-2.05 .51l-30.45 17C82.853 215.797 72.783 210.139 63.89 202.9l-.12-34.12c.001-.747-.21-1.479-.61-2.11-.66-1-1.3-2.14-1.91-3.23-.354-.638-.876-1.167-1.51-1.53L29.49 144.68c-1.97-11.026-1.97-22.314 0-33.34L59.7 94.16c.634-.363 1.156-.892 1.51-1.53 .61-1.09 1.25-2.17 1.91-3.23 .396-.633 .608-1.364 .61-2.11l.16-34.15C72.754 45.887 82.801 40.214 93.59 36.37l30.4 17c.627 .346 1.334 .522 2.05 .51 1.28 0 2.57 0 3.84 0 .717 .017 1.425-.159 2.05-.51l30.45-17c10.793 3.837 20.849 9.495 29.73 16.73l.12 34.12c-.001 .747 .21 1.479 .61 2.11 .66 1 1.3 2.14 1.91 3.23 .354 .638 .876 1.167 1.51 1.53l30.25 17.23c1.98 11.024 1.99 22.312 .03 33.34Z"),
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
        return _gearSix!!
    }

private var _gearSix: ImageVector? = null
