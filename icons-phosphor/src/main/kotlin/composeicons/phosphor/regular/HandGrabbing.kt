package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.HandGrabbing: ImageVector
    get() {
        if (_handGrabbing != null) return _handGrabbing!!
        _handGrabbing = phosphorRegularIcon(
            name = "HandGrabbing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188 80c-4.668-.007-9.263 1.163-13.36 3.4C171.629 74.073 163.961 66.999 154.421 64.75c-9.539-2.25-19.56 .652-26.421 7.65C120.037 64.273 107.949 61.773 97.415 66.074 86.882 70.375 79.998 80.622 80 92v20h-12c-15.464 0-28 12.536-28 28v12c0 48.601 39.399 88 88 88 48.601 0 88-39.399 88-88v-44C216 92.536 203.464 80 188 80ZM200 152c0 39.764-32.236 72-72 72C88.235 224 56 191.764 56 152v-12c0-6.627 5.373-12 12-12h12v24c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-60c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v28c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-28c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v28c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-12c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _handGrabbing!!
    }

private var _handGrabbing: ImageVector? = null
