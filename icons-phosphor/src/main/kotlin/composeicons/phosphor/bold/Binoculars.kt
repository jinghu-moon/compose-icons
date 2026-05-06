package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Binoculars: ImageVector
    get() {
        if (_binoculars != null) return _binoculars!!
        _binoculars = phosphorBoldIcon(
            name = "Binoculars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M241 150.65c0 0 0 0 0-.05-.719-2.018-1.564-3.988-2.53-5.9L196.93 50.18c-.6-1.361-1.448-2.599-2.5-3.65C187.678 39.776 178.52 35.982 168.97 35.982c-9.55 0-18.708 3.794-25.46 10.548C141.265 48.777 140.003 51.823 140 55v21h-24v-21c-0-3.18-1.263-6.23-3.51-8.48C105.738 39.766 96.58 35.972 87.03 35.972c-9.55 0-18.708 3.794-25.46 10.548-1.052 1.051-1.9 2.289-2.5 3.65L17.53 144.7c-.966 1.912-1.811 3.882-2.53 5.9 0 0 0 0 0 .05-6.934 19.52-1.621 41.294 13.525 55.427 15.146 14.132 37.235 17.927 56.229 9.659C103.748 207.468 116.023 188.715 116 168v-68h24v68c-.023 20.715 12.252 39.468 31.246 47.736 18.994 8.268 41.083 4.473 56.229-9.659C242.621 191.944 247.934 170.17 241 150.65ZM80 62.28c3.49-2.533 8.071-2.999 12-1.22v63.15C81.361 117.383 68.595 114.673 56.1 116.59ZM64 196C48.536 196 36 183.464 36 168c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28ZM164 61.06c3.931-1.767 8.505-1.301 12 1.22l23.87 54.31c-12.495-1.917-25.261 .793-35.9 7.62ZM192 196c-15.464 0-28-12.536-28-28 0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28Z"),
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
        return _binoculars!!
    }

private var _binoculars: ImageVector? = null
