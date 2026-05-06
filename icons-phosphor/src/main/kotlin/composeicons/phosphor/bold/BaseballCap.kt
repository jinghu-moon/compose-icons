package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BaseballCap: ImageVector
    get() {
        if (_baseballCap != null) return _baseballCap!!
        _baseballCap = phosphorBoldIcon(
            name = "BaseballCap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.381 20.066 20.066 68.381 20 128v56c-.031 10.525 5.872 20.17 15.26 24.93 9.419 4.813 20.745 3.908 29.28-2.34C76.2 198.11 96.68 188 128 188c31.32 0 51.8 10.1 63.46 18.58 8.509 6.229 19.795 7.15 29.201 2.381C230.066 204.193 235.995 194.545 236 184v-56C235.934 68.381 187.619 20.066 128 20ZM212 128v1.87c-10.556-5.939-21.716-10.733-33.29-14.3-3.039-23.729-11.028-46.555-23.45-67C189.168 60.249 211.947 92.137 212 128ZM153.54 109.88c-16.934-2.507-34.146-2.507-51.08 0C106.617 88.62 115.33 68.512 128 50.94c12.668 17.573 21.38 37.68 25.54 58.94ZM100.74 48.57c-12.422 20.445-20.411 43.271-23.45 67C65.716 119.137 54.556 123.931 44 129.87v-1.87C44.053 92.137 66.832 60.249 100.74 48.57ZM209.85 187.57c-1.376 .721-3.044 .581-4.28-.36C191 176.61 165.77 164 128 164c-37.77 0-63 12.61-77.57 23.18-1.236 .941-2.904 1.081-4.28 .36C44.789 186.897 43.944 185.504 44 184v-25.86c50.574-34.864 117.426-34.864 168 0v25.86c.056 1.504-.789 2.897-2.15 3.54Z"),
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
        return _baseballCap!!
    }

private var _baseballCap: ImageVector? = null
