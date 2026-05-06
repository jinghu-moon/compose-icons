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
                pathData = parseSvgPathData("M17 2v2h3c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-16C3.448 22 3 21.552 3 21v-16C3 4.448 3.448 4 4 4h3v-2h10ZM13 11h-2v2h-2v2h1.999L11 17h2l-.001-2h2.001v-2h-2v-2ZM15 4h-6v2h6v-2Z"),
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
