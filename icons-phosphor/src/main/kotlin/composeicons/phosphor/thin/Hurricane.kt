package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Hurricane: ImageVector
    get() {
        if (_hurricane != null) return _hurricane!!
        _hurricane = phosphorThinIcon(
            name = "Hurricane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 100c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28 15.464 0 28-12.536 28-28 0-15.464-12.536-28-28-28ZM128 148c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM153.49 47.94 163.87 9c.359-1.346-.009-2.782-.97-3.79-.961-1.008-2.378-1.444-3.74-1.15C138.84 9.052 119.477 17.342 101.84 28.6 64 53 44 87.32 44 128c.016 36.571 23.671 68.938 58.51 80.06L92.13 247c-.359 1.346 .009 2.782 .97 3.79 .961 1.008 2.378 1.444 3.74 1.15 20.321-4.993 39.685-13.286 57.32-24.55C192 203 212 168.68 212 128 211.984 91.429 188.329 59.062 153.49 47.94ZM150 220.51c-15.028 9.518-31.316 16.88-48.39 21.87l9.61-36c.274-1.026 .129-2.12-.403-3.039-.533-.919-1.409-1.589-2.437-1.861C75.121 192.571 51.995 162.431 52 128 52 89.71 70.16 58.59 106 35.49c15.028-9.518 31.316-16.88 48.39-21.87l-9.61 36c-.274 1.026-.129 2.12 .403 3.039 .533 .919 1.409 1.589 2.437 1.861C180.879 63.429 204.005 93.569 204 128c0 38.29-18.16 69.41-54 92.51Z"),
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
        return _hurricane!!
    }

private var _hurricane: ImageVector? = null
