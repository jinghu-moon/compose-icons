package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HandGrabbing: ImageVector
    get() {
        if (_handGrabbing != null) return _handGrabbing!!
        _handGrabbing = phosphorThinIcon(
            name = "HandGrabbing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188 84c-5.942-.005-11.672 2.205-16.07 6.2C171.154 79.979 163.971 71.379 154.052 68.794 144.133 66.209 133.667 70.208 128 78.75 122.15 69.931 111.213 65.984 101.08 69.036 90.946 72.087 84.007 81.417 84 92v24h-16c-13.255 0-24 10.745-24 24v12c0 46.392 37.608 84 84 84 46.392 0 84-37.608 84-84v-44C212 94.745 201.255 84 188 84ZM204 152c0 41.974-34.026 76-76 76C86.026 228 52 193.974 52 152v-12c0-8.837 7.163-16 16-16h16v28c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-60c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16v28c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-28c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16v28c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-12c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16Z"),
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
