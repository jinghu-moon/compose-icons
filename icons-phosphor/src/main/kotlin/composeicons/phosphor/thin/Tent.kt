package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Tent: ImageVector
    get() {
        if (_tent != null) return _tent!!
        _tent = phosphorThinIcon(
            name = "Tent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M251.66 190.38l-64-144C187.019 44.932 185.584 43.999 184 44h-112c-1.566 .005-2.984 .924-3.63 2.35 0 0 0 0 0 0v.06h0L4.37 190.34c-.564 1.237-.462 2.675 .272 3.819 .734 1.144 1.998 1.837 3.358 1.841h240c1.354 .001 2.616-.683 3.355-1.817 .739-1.134 .854-2.565 .305-3.803ZM68 66.85v121.15h-53.84ZM76 188v-121.15L129.84 188ZM138.6 188 78.16 52h103.24l60.44 136Z"),
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
        return _tent!!
    }

private var _tent: ImageVector? = null
