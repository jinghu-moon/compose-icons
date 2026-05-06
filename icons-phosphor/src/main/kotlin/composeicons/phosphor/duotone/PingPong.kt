package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PingPong: ImageVector
    get() {
        if (_pingPong != null) return _pingPong!!
        _pingPong = phosphorDuotoneIcon(
            name = "PingPong",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M206.6 81.4 81.4 206.6C50.588 190.016 31.55 157.679 32 122.69 32.69 73.14 73.13 32.69 122.68 32.01c34.99-.456 67.332 18.579 83.92 49.39Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M240 196c-.389-4.688-2.821-8.967-6.65-11.7l-38-27.15 17-16.95c9.42-9.34 13.548-22.771 11-35.79C218.696 81.562 206.167 61.074 187.95 46.52 169.449 31.627 146.328 23.662 122.58 24 68.519 24.914 24.914 68.519 24 122.58c-.293 23.719 7.68 46.799 22.55 65.28 14.554 18.217 35.042 30.746 57.89 35.4 13.019 2.546 26.449-1.581 35.79-11l16.95-17 27.15 38c2.708 3.855 6.977 6.321 11.67 6.74 .44 0 .88 .05 1.32 .05 4.243-.002 8.311-1.689 11.31-4.69l26.64-26.64c3.386-3.328 5.119-7.988 4.73-12.72ZM59 177.83C46.475 162.258 39.758 142.813 40 122.83 40.769 77.418 77.389 40.786 122.8 40c19.98-.226 39.42 6.489 55 19 7.392 5.938 13.739 13.069 18.78 21.1L80.1 196.58C72.072 191.548 64.94 185.211 59 177.83ZM197.35 224 164.72 178.31c-1.367-1.913-3.507-3.127-5.85-3.32q-.33 0-.66 0c-2.122-.002-4.158 .84-5.66 2.34l-23.63 23.63c-5.562 5.645-13.579 8.133-21.36 6.63-4.187-.838-8.3-2.008-12.3-3.5L204.06 95.29c1.49 4.001 2.661 8.114 3.5 12.3 1.505 7.781-.983 15.799-6.63 21.36l-23.63 23.6c-1.665 1.662-2.514 3.972-2.321 6.317 .193 2.344 1.407 4.485 3.321 5.853L224 197.35Z"),
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
        return _pingPong!!
    }

private var _pingPong: ImageVector? = null
