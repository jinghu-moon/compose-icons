package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Hurricane: ImageVector
    get() {
        if (_hurricane != null) return _hurricane!!
        _hurricane = phosphorBoldIcon(
            name = "Hurricane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 92c-19.882 0-36 16.118-36 36 0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36C164 108.118 147.882 92 128 92ZM128 140c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM163.37 43l8.14-27.65c1.156-3.982 .173-8.279-2.598-11.364C166.141 .901 161.973-.534 157.89 .19 136.675 4.627 116.354 12.587 97.77 23.74 57.36 48.28 36 84.33 36 128c.012 37.16 22.342 70.676 56.63 85l-8.14 27.65c-1.053 3.623-.341 7.53 1.922 10.549 2.263 3.019 5.815 4.797 9.588 4.801 .708 .001 1.414-.062 2.11-.19 21.215-4.437 41.536-12.397 60.12-23.55C198.64 207.72 220 171.67 220 128 219.988 90.84 197.658 57.324 163.37 43ZM146.37 211.35c-10.335 6.25-21.311 11.373-32.74 15.28l5.28-18c.919-3.107 .543-6.453-1.043-9.278-1.586-2.825-4.246-4.889-7.377-5.722C80.745 185.703 60.035 158.783 60 128 60 92.88 76.7 64.82 109.65 44.61c10.335-6.253 21.311-11.379 32.74-15.29l-5.28 18c-.919 3.107-.543 6.453 1.043 9.278 1.586 2.825 4.246 4.889 7.377 5.722C175.285 70.259 195.99 97.204 196 128c0 35.12-16.7 63.17-49.65 83.39Z"),
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
