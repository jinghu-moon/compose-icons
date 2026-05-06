package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.StitchesLogo: ImageVector
    get() {
        if (_stitchesLogo != null) return _stitchesLogo!!
        _stitchesLogo = radixIcon(
            name = "StitchesLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.5 .85c3.673 0 6.649 2.978 6.649 6.65-0 3.672-2.977 6.649-6.649 6.649C3.828 14.15 .85 11.173 .85 7.5 .85 3.828 3.828 .85 7.5 .85ZM6.849 13.111c.214 .025 .431 .039 .651 .039 2.324-0 4.319-1.404 5.187-3.41L6.849 13.111ZM7.826 5.199l3.536 2.622 .067 .062c.14 .156 .156 .394 .026 .568-.038 .051-.086 .089-.138 .119l.001 .002L9.873 9.405c-.003 .002-.007 .004-.01 .006l-1.453 .838c-.013 .009-.026 .016-.04 .024L4.687 12.399c.28 .161 .574 .299 .882 .411L13.062 8.484c.056-.319 .088-.648 .088-.983 0-1.698-.75-3.221-1.936-4.257L7.826 5.199ZM1.912 6.656c-.041 .276-.062 .558-.062 .845 0 1.739 .787 3.294 2.023 4.33L7.324 9.837 3.725 7.265 3.718 7.258C3.698 7.244 3.68 7.227 3.662 7.209L3.657 7.204 3.655 7.202C3.647 7.193 3.64 7.183 3.633 7.174 3.622 7.16 3.611 7.146 3.602 7.13 3.601 7.128 3.598 7.126 3.597 7.123 3.594 7.118 3.592 7.112 3.589 7.107 3.581 7.09 3.572 7.074 3.566 7.057 3.561 7.044 3.557 7.03 3.553 7.017 3.552 7.012 3.55 7.008 3.549 7.003L3.539 6.954C3.539 6.949 3.539 6.944 3.538 6.939c-.007-.079 .006-.159 .041-.233l.044-.073c.006-.008 .012-.014 .019-.021 .013-.016 .027-.031 .042-.045 .005-.005 .011-.009 .017-.014 .015-.013 .031-.025 .048-.035 .004-.003 .009-.006 .014-.009L10.421 2.662c-.272-.165-.561-.305-.86-.423L1.912 6.656ZM4.815 6.938 8.18 9.343l.626-.36L5.509 6.537l-.694 .4ZM6.358 6.047 9.656 8.492l.618-.357L6.977 5.689l-.619 .358ZM7.5 1.85C5.113 1.85 3.072 3.331 2.245 5.424L8.329 1.911C8.059 1.872 7.782 1.85 7.5 1.85Z"),
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
        return _stitchesLogo!!
    }

private var _stitchesLogo: ImageVector? = null
