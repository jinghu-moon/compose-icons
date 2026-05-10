package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PokerSpadesFill: ImageVector
    get() {
        if (_pokerSpadesFill != null) return _pokerSpadesFill!!
        _pokerSpadesFill = remixIcon(
            name = "PokerSpadesFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.951 15.893C10.008 16.586 8.807 17 7.5 17 4.462 17 2 14.761 2 12 2 8.452 5.525 5.911 8.644 3.662 9.92 2.742 11.129 1.871 12 1c.871 .871 2.08 1.742 3.356 2.662C18.475 5.911 22 8.452 22 12c0 2.761-2.462 5-5.5 5-1.307 0-2.508-.414-3.451-1.107 .284 1.646 1.009 2.82 1.794 4.092 .122 .197 .245 .397 .369 .602 .384 .636-.086 1.413-.83 1.413h-4.764c-.743 0-1.214-.777-.83-1.413 .123-.204 .247-.404 .369-.602 .785-1.272 1.51-2.446 1.794-4.092Z"),
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
        return _pokerSpadesFill!!
    }

private var _pokerSpadesFill: ImageVector? = null
