package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Toilet: ImageVector
    get() {
        if (_toilet != null) return _toilet!!
        _toilet = phosphorBoldIcon(
            name = "Toilet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 68c0 6.627-5.373 12-12 12h-16C93.373 80 88 74.627 88 68c0-6.627 5.373-12 12-12h16c6.627 0 12 5.373 12 12ZM176.15 195.62l3.65 25.55c.82 5.74-.891 11.554-4.69 15.934-3.799 4.38-9.312 6.896-15.11 6.896h-64c-5.798 0-11.311-2.516-15.11-6.896-3.799-4.38-5.51-10.194-4.69-15.934l3.65-25.55C47.892 178.043 28.026 144.473 28 108c0-6.627 5.373-12 12-12h12v-56C52 28.954 60.954 20 72 20h112c11.046 0 20 8.954 20 20v56h12c6.627 0 12 5.373 12 12-.026 36.473-19.892 70.043-51.85 87.62ZM76 96h104v-52h-104ZM153.21 204.78c-16.533 4.293-33.888 4.293-50.42 0L100.61 220h54.78ZM203.05 120h-150.05c5.887 36.882 37.701 64.021 75.05 64.021 37.349 0 69.163-27.138 75.05-64.021Z"),
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
        return _toilet!!
    }

private var _toilet: ImageVector? = null
