package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandSnapchat: ImageVector
    get() {
        if (_brandSnapchat != null) return _brandSnapchat!!
        _brandSnapchat = tablerFilledIcon(
            name = "BrandSnapchat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 1.96c1.56-.001 3.057 .619 4.16 1.722 1.103 1.103 1.723 2.6 1.722 4.16 0 .618 .008 1.174 .03 1.678l.008 .21 .084-.115q.46-.627 1.102-1.29l.187-.19c.391-.39 1.024-.39 1.415 0 .39 .391 .39 1.024-0 1.415-2.637 2.637-2.51 3.795 .76 5.527l.048 .025c.235 .139 .402 .369 .46 .636l.004 .022 .003 .013 .006 .043 .006 .032v.009l.003 .025 .001 .051 .002 .026-.001 .009v.025l-.003 .042-.002 .034-.002 .015-.002 .02-.004 .016-.01 .06-.007 .026-.006 .02-.016 .06-.013 .029-.005 .013-.024 .062c-.049 .104-.116 .199-.197 .28l-.03 .025-.016 .014-.043 .039-.013 .007-.018 .015-.051 .033-.02 .014-.008 .003-.014 .01c-.032 .018-.064 .034-.098 .049l-.013 .003-.146 .066c-.576 .255-.81 .365-1.008 .474l-.053 .03c-.27 .155-.398 .277-.558 .525-.156 .245-.293 .516-.715 1.41-.165 .35-.517 .573-.904 .573-1.067 0-1.798 .25-2.879 .868l-.426 .246c-.176 .102-.311 .178-.447 .25-.794 .423-1.464 .636-2.248 .636-.784 0-1.454-.213-2.248-.636-.15-.081-.299-.164-.447-.25l-.426-.246C7.798 20.21 7.067 19.96 6 19.96c-.387-0-.739-.223-.904-.573-.422-.894-.559-1.165-.715-1.41-.134-.223-.327-.405-.558-.525-.228-.13-.47-.243-1.227-.577l.02 .007-.013-.003c-.034-.015-.066-.032-.098-.05l-.014-.009-.028-.017-.051-.033-.018-.015-.013-.007-.043-.039-.012-.01-.004-.004-.03-.025c-.081-.081-.148-.176-.197-.28l-.024-.062-.005-.013-.013-.028-.016-.061-.005-.012-.008-.035-.01-.059-.004-.016-.002-.02-.002-.015-.002-.035L2 15.993l.001-.025L2 15.958l.002-.025 .001-.05 .003-.026v-.01l.006-.03 .006-.044 .004-.014 .002-.021c.058-.267 .225-.498 .461-.636l.048-.025 .204-.11C5.74 13.332 5.869 12.182 3.457 9.717L3.293 9.55C2.914 9.158 2.919 8.534 3.305 8.148c.386-.386 1.009-.391 1.402-.012q.764 .763 1.289 1.479l.083 .115 .01-.21q.025-.628 .028-1.374l.001-.304C6.117 6.282 6.737 4.785 7.84 3.682 8.943 2.579 10.44 1.959 12 1.96"),
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
        return _brandSnapchat!!
    }

private var _brandSnapchat: ImageVector? = null
