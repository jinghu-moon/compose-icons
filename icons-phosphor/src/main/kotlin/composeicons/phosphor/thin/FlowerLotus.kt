package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FlowerLotus: ImageVector
    get() {
        if (_flowerLotus != null) return _flowerLotus!!
        _flowerLotus = phosphorThinIcon(
            name = "FlowerLotus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M242.37 123.65c-1.53-2.697-4.082-4.665-7.08-5.46-8.584-2.18-17.499-2.746-26.29-1.67 5.48-21.46 2.38-38.36-.75-48-1.904-5.971-8.035-9.517-14.16-8.19-11.204 2.524-21.76 7.349-31 14.17-6.1-14.17-15.701-26.557-27.9-36-4.265-3.251-10.175-3.251-14.44 0-12.199 9.443-21.8 21.83-27.9 36C83.609 67.681 73.053 62.856 61.85 60.33 55.725 59.003 49.594 62.549 47.69 68.52c-3.13 9.68-6.23 26.58-.75 48-8.781-1.073-17.685-.506-26.26 1.67-2.998 .795-5.55 2.763-7.08 5.46-1.623 2.787-2.055 6.11-1.2 9.22 3.24 12 13.2 34.81 43.52 52.92C86.24 203.9 113.45 204 128 204c14.55 0 41.61 0 72.07-18.21 30.46-18.21 40.28-40.93 43.52-52.92 .849-3.112 .41-6.436-1.22-9.22ZM195.8 68.11c2.126-.44 4.238 .813 4.87 2.89 4 12.5 8 38.35-10.77 71-10.45 18.19-25.11 32.2-38.11 41.44C162 170 172 149.24 172 119.19c.106-12.574-1.881-25.078-5.88-37 8.736-6.821 18.871-11.629 29.68-14.08ZM55.33 71c.649-2.06 2.757-3.29 4.87-2.84 10.805 2.436 20.939 7.227 29.68 14.03-3.999 11.922-5.986 24.426-5.88 37 0 30.05 10 50.82 20.21 64.23-13-9.24-27.66-23.25-38.11-41.44C47.32 109.3 51.29 83.45 55.33 71ZM60.05 179C32.15 162.33 23.05 141.68 20.15 130.85c-.298-1.055-.15-2.187 .41-3.13 .471-.853 1.269-1.477 2.21-1.73 8.743-2.194 17.848-2.535 26.73-1 2.556 7.287 5.79 14.317 9.66 21 13.28 23.1 32.66 39.67 48.27 49.11C90.65 193.212 74.483 187.694 60.05 178.93ZM128.05 195.34c-6.518-4.538-12.282-10.072-17.08-16.4C98.37 162.58 92 142.5 92 119.19 92 74.94 115.49 52.44 125.59 44.83c1.426-1.077 3.394-1.077 4.82 0C140.51 52.44 164 74.94 164 119.19c0 23.31-6.37 43.39-18.92 59.68-4.798 6.328-10.562 11.862-17.08 16.4ZM235.9 130.85c-2.92 10.83-12 31.48-39.9 48.15-14.434 8.757-30.602 14.268-47.38 16.15 15.61-9.44 35-26 48.27-49.11 3.87-6.683 7.104-13.713 9.66-21 8.882-1.54 17.988-1.199 26.73 1 .941 .253 1.739 .877 2.21 1.73 .51 .917 .64 1.998 .36 3.01Z"),
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
        return _flowerLotus!!
    }

private var _flowerLotus: ImageVector? = null
