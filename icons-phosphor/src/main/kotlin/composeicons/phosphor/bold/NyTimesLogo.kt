package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NyTimesLogo: ImageVector
    get() {
        if (_nyTimesLogo != null) return _nyTimesLogo!!
        _nyTimesLogo = phosphorBoldIcon(
            name = "NyTimesLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 148c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM188 108c-1.753 .003-3.484-.383-5.07-1.13L118.25 76.69C87.577 81.141 63.795 105.77 60.42 136.58l65.93-35.17c3.72-1.985 8.208-1.873 11.824 .297 3.615 2.169 5.827 6.077 5.826 10.293v98.11c19.426-4.659 35.804-17.658 44.75-35.52 1.897-3.889 5.741-6.455 10.06-6.717 4.319-.262 8.444 1.822 10.797 5.454 2.352 3.632 2.568 8.248 .563 12.083-14.572 29.113-43.51 48.296-76 50.38-.716 .135-1.442 .205-2.17 .21-.35 0-.68 0-1-.05-1 0-2 .05-3 .05C95.868 235.996 66.066 219.228 49.384 191.766 32.701 164.304 31.555 130.128 46.36 101.61 31.464 91.998 24.672 73.727 29.672 56.718 34.672 39.709 50.272 28.021 68 28c1.753-.003 3.484 .383 5.07 1.13L190.31 83.83c8.292-1.218 14.239-8.629 13.632-16.988C203.335 58.483 196.381 52.008 188 52c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 22.091 0 40 17.909 40 40 0 22.091-17.909 40-40 40ZM80 192.12v-38.79l-17.39 9.28c3.189 11.157 9.175 21.315 17.39 29.51ZM120 132l-16 8.53v67.08c5.153 1.952 10.527 3.262 16 3.9ZM86.5 61.88 65.69 52.17c-6.758 .993-12.14 6.166-13.399 12.879-1.26 6.713 1.881 13.485 7.819 16.861C67.622 73.691 76.564 66.905 86.5 61.88Z"),
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
        return _nyTimesLogo!!
    }

private var _nyTimesLogo: ImageVector? = null
