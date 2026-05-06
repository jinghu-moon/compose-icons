package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.VolumeVibrateLine: ImageVector
    get() {
        if (_volumeVibrateLine != null) return _volumeVibrateLine!!
        _volumeVibrateLine = remixIcon(
            name = "VolumeVibrateLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.389 3.161l1.414 1.414L18.328 7.05l2.476 2.476-2.476 2.474 2.476 2.476-2.475 2.475 2.475 2.475-1.414 1.414L15.5 16.95l2.475-2.475L15.5 12 17.975 9.525 15.5 7.05 19.389 3.161ZM12.887 3.738c.073 .089 .113 .201 .113 .317v15.89c0 .276-.224 .5-.5 .5-.115 0-.227-.04-.317-.113L6.889 15.999 3 16C2.448 16 2 15.552 2 15v-6C2 8.448 2.448 8 3 8L6.889 7.999 12.183 3.668c.214-.175 .529-.143 .704 .07ZM11 7.22 7.603 9.999 4 9.999v4.001l3.603-.001L11 16.779v-9.559Z"),
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
        return _volumeVibrateLine!!
    }

private var _volumeVibrateLine: ImageVector? = null
