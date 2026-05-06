package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Target: ImageVector
    get() {
        if (_target != null) return _target!!
        _target = phosphorThinIcon(
            name = "Target",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M218.26 84.89c22.31 46.576 5.55 102.479-38.704 129.099C135.302 240.608 78.063 229.216 47.373 187.681 16.683 146.146 22.605 88.085 61.048 53.601c38.443-34.484 96.803-34.086 134.772 .919L221.17 29.17c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66l-96 96c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66l31-31C140.144 80.831 116.956 80.572 100.636 93.55 84.317 106.528 79.346 129.178 88.733 147.796c9.387 18.618 30.552 28.092 50.691 22.689 20.139-5.403 33.72-24.199 32.526-45.016-.127-2.209 1.561-4.103 3.77-4.23 2.209-.127 4.103 1.561 4.23 3.77 1.423 24.67-14.712 46.934-38.599 53.261-23.887 6.327-48.928-5.03-59.904-27.17C70.471 128.962 76.593 102.156 96.09 86.975c19.498-15.181 46.987-14.544 65.76 1.525L190.19 60.17C153.278 26.584 96.321 28.55 61.813 64.602 27.305 100.653 27.832 157.643 63 193.05c31.704 31.587 81.539 35.776 118.072 9.927C217.605 177.127 230.237 128.738 211 88.33c-.656-1.295-.559-2.845 .254-4.048 .813-1.203 2.215-1.871 3.662-1.745 1.447 .126 2.711 1.027 3.304 2.353Z"),
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
        return _target!!
    }

private var _target: ImageVector? = null
