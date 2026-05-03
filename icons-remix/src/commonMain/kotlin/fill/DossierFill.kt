package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.DossierFill: ImageVector
    get() {
        if (_dossierFill != null) return _dossierFill!!
        _dossierFill = remixIcon(
            name = "DossierFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 2.000 L 17.000 4.000 L 20.000 4.000 C 20.552 4.000 21.000 4.448 21.000 5.000 L 21.000 21.000 C 21.000 21.552 20.552 22.000 20.000 22.000 L 4.000 22.000 C 3.448 22.000 3.000 21.552 3.000 21.000 L 3.000 5.000 C 3.000 4.448 3.448 4.000 4.000 4.000 L 7.000 4.000 L 7.000 2.000 L 17.000 2.000 ZM 13.000 11.000 L 11.000 11.000 L 11.000 13.000 L 9.000 13.000 L 9.000 15.000 L 10.999 15.000 L 11.000 17.000 L 13.000 17.000 L 12.999 15.000 L 15.000 15.000 L 15.000 13.000 L 13.000 13.000 L 13.000 11.000 ZM 15.000 4.000 L 9.000 4.000 L 9.000 6.000 L 15.000 6.000 L 15.000 4.000 Z"),
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
        return _dossierFill!!
    }

private var _dossierFill: ImageVector? = null
